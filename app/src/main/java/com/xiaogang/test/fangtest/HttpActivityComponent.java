package com.xiaogang.test.fangtest;

import dagger.Component;

@Component(modules = HttpActivityMoudle.class)
public interface HttpActivityComponent {
    void inject(HttpActivity httpActivity);
}
