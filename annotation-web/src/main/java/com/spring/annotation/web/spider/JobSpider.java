package com.spring.annotation.web.spider;
import com.spring.annotation.web.entity.Job;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/27
 */
public class JobSpider {
    private static final Integer SUCCESS = 200;

    public static List<Job> getJobs() throws IOException {
        List<Job> jobList = new ArrayList<>();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36";
        String url = "https://job.csdn.net/";
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get对象
        HttpGet get = new HttpGet(url);
        get.setHeader("User-Agent",userAgent);
        //创建context对象
        HttpClientContext context = HttpClientContext.create();
        //创建response对象
        CloseableHttpResponse response = httpClient.execute(get, context);
        System.out.println(response.getStatusLine());

        if (response.getStatusLine().getStatusCode() == SUCCESS) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String res = EntityUtils.toString(entity,"UTF-8");
                Document document = Jsoup.parse(res);
                Elements elements = document.getElementsByClass("job_desc job_desc_un_frist");
                System.out.println(elements.size());

                for (Element element:elements) {
                    String logo = element.child(0).getElementsByTag("img").attr("src");
                    System.out.println(logo);
                    String name = element.child(1).select(".job_name").text();
//                    System.out.println(name.select(".job_name").text());

                    String enter = element.child(2).select(".enter_name").text();
//                    System.out.println(enter.select(".enter_name").text());

                    String salary = element.child(3).select(".job_salary").text();
//                    System.out.println(salary.select(".job_salary").text());

                    String time = element.child(4).select(".job_time").text();
//                    System.out.println(time.select(".job_time").text());

                    Job job = Job.builder()
                            .jobLogo(logo)
                            .jobName(name)
                            .jobEnter(enter)
                            .jobSalary(salary)
                            .upTime(time)
                            .build();
                    jobList.add(job);
                }
            }
        }
        return jobList;
    }

    public static void main(String[] args) throws IOException {
        for (Job job:getJobs()) {
            System.out.println(job);
        }
    }
}
