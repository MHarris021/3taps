package com.darcstarsolutions.apis.threetaps.reference;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mharris021 on 6/12/14.
 */
public class Source {

    @JsonProperty
    private String code;

    @JsonProperty
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Source{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
