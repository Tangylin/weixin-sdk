package com.riversoft.weixin.mp.menu.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.riversoft.weixin.common.menu.MenuType;

/**
 * @borball on 6/7/2016.
 */
public class MenuButton {

    private MenuType type;
    private String name;
    private String key;
    private String url;

    @JsonProperty("sub_button")
    private MenuButtonList subItems;

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MenuButtonList getSubItems() {
        return subItems;
    }

    public void setSubItems(MenuButtonList subItems) {
        this.subItems = subItems;
    }
}
