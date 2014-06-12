package com.darcstarsolutions.apis.threetaps.reference;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mharris021 on 6/12/14.
 */

public class DataSources {

    @JsonProperty
    private List<Source> sources;

    @JsonProperty
    private boolean success;

    public DataSources() {
        this.sources = new ArrayList<>();
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataSources{");
        sb.append("sources=").append(sources);
        sb.append(", success=").append(success);
        sb.append('}');
        return sb.toString();
    }
}
