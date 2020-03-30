package com.spring.annotation.web.controller;

import com.spring.annotation.web.entity.HeadImage;
import com.spring.annotation.web.entity.Mountain;
import com.spring.annotation.web.entity.People;
import com.spring.annotation.web.entity.Wallpaper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-03-24 9:46
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("message", "PHOTO LIBRARY");
        Mountain[] mountains = {
                new Mountain("风景", "山川", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2636916656,2653234963&fm=26&gp=0.jpg"),
                new Mountain("风景", "河流", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585056862004&di=30aed1f705b447ca9e0608797fe0495a&imgtype=0&src=http%3A%2F%2Fs1.1zoom.me%2Fbig0%2F723%2FVietnam_Scenery_Mountains_Fields_Rivers_Cao_Bang_536151_1280x853.jpg"),
                new Mountain("风景", "山川", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2675756541,2679520019&fm=26&gp=0.jpg"),
                new Mountain("风景", "河流", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585056862005&di=1a3d9aa45a2b29cb7ef57bbdfc5ac257&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20141226%2Fmp623188_1419574501562_14.jpg")
        };
        People[] people = {
                new People("人物", "动画人物", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585060354824&di=709fc0326f2f3828974feeaf6dc9e543&imgtype=0&src=http%3A%2F%2Fg.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Faa64034f78f0f736d931054e0f55b319eac413b5.jpg"),
                new People("人物", "动画人物", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585060354821&di=b83dba4b798947fb5c05ede4aaf4fe9e&imgtype=0&src=http%3A%2F%2Fwww.ttpaihang.com%2Fimage%2Fvote%2Fu15022420174895494.jpg"),
                new People("人物", "动画人物", "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2631881217,2151523310&fm=26&gp=0.jpg"),
                new People("人物", "动画人物", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585060658992&di=9db666ee9c1f4bef3e4e4609bc23c59c&imgtype=0&src=http%3A%2F%2Fimg4.imgtn.bdimg.com%2Fit%2Fu%3D2376984754%2C800202528%26fm%3D214%26gp%3D0.jpg")
        };
        HeadImage[] headImages = {
                new HeadImage("头像", "男生头像", "http://img0.imgtn.bdimg.com/it/u=3741733804,1966033566&fm=26&gp=0.jpg"),
                new HeadImage("头像", "女生头像", "http://img4.imgtn.bdimg.com/it/u=1671428887,22416777&fm=26&gp=0.jpg"),
                new HeadImage("头像", "男生头像", "http://img1.imgtn.bdimg.com/it/u=2187202776,1412016157&fm=26&gp=0.jpg"),
                new HeadImage("头像", "女生头像", "http://img1.imgtn.bdimg.com/it/u=1898582417,1582081952&fm=26&gp=0.jpg")
        };
        Wallpaper[] wallpapers = {
                new Wallpaper("壁纸", "赛车", "http://attach.bbs.miui.com/forum/201105/17/113554rnu40q7nbgnn3lgq.jpg"),
                new Wallpaper("壁纸", "小黄人", "http://d.hiphotos.baidu.com/zhidao/pic/item/6a63f6246b600c334c3e91cb1e4c510fd9f9a16a.jpg"),
                new Wallpaper("壁纸", "河面", "http://pic1.win4000.com/wallpaper/b/55597435bb036.jpg"),
                new Wallpaper("壁纸", "星辰", "http://attach.bbs.miui.com/forum/201401/11/145825zn1sxa8anrg11gt1.jpg")
        };
        List<Mountain> mountainList = Arrays.asList(mountains);
        List<People> peopleList = Arrays.asList(people);
        List<HeadImage> headImageList = Arrays.asList(headImages);
        List<Wallpaper> wallpaperList = Arrays.asList(wallpapers);
        model.addAttribute("mountainList", mountainList);
        model.addAttribute("peopleList", peopleList);
        model.addAttribute("headImageList", headImageList);
        model.addAttribute("wallpaperList", wallpaperList);
        return "home";
    }
}
