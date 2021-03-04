package com.imooc.factory.i18n;

public class I18NFactory {
    //静态工厂，就无需实例化对象而可以直接调用方法
    public static I18N getI18NObject(String area) {
        if(area.equals(("China"))){
            return new Chinese();
        } else if(area.equals("Italian")){
            return new Italian();


        } else if(area.equals("Spanish")){
            return new Spanish();
        } else {
            return null;
        }
    }
}
