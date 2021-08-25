package cn.zhouyafeng.itchat4j.utils.enums.parameters;

/**
 * UUID
 * <p>
 * Created by xiaoxiaomo on 2017/5/7.
 */
public enum UUIDParaEnum {

    APP_ID("appid", "wx782c26e4c19acffb"),
    FUN("fun", "new"),
    REDIRECT_URI("redirect_uri", "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxnewloginpage?mod=desktop"),
    LANG("lang", "zh_CN"),
    _("_", "时间戳");

    private String para;
    private String value;

    UUIDParaEnum(String para, String value) {
        this.para = para;
        this.value = value;
    }

    public String para() {
        return para;
    }

    public String value() {
        return value;
    }
}
