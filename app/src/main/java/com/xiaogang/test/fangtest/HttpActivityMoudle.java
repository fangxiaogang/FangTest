package com.xiaogang.test.fangtest;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpActivityMoudle {

    @Provides
    OkhttpClient providesokhttpClient(){
        return new OkhttpClient();
    }
}
