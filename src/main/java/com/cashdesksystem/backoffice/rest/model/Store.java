
package com.cashdesksystem.backoffice.rest.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "address",
    "vozvrat",
    "shift",
    "number",
    "DATE",
    "cashbox"
})
public class Store {

    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("vozvrat")
    private Boolean vozvrat;
    @JsonProperty("shift")
    private String shift;
    @JsonProperty("number")
    private String number;
    @JsonProperty("DATE")
    private String dATE;
    @JsonProperty("cashbox")
    private String cashbox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("vozvrat")
    public Boolean getVozvrat() {
        return vozvrat;
    }

    @JsonProperty("vozvrat")
    public void setVozvrat(Boolean vozvrat) {
        this.vozvrat = vozvrat;
    }

    @JsonProperty("shift")
    public String getShift() {
        return shift;
    }

    @JsonProperty("shift")
    public void setShift(String shift) {
        this.shift = shift;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("DATE")
    public String getDATE() {
        return dATE;
    }

    @JsonProperty("DATE")
    public void setDATE(String dATE) {
        this.dATE = dATE;
    }

    @JsonProperty("cashbox")
    public String getCashbox() {
        return cashbox;
    }

    @JsonProperty("cashbox")
    public void setCashbox(String cashbox) {
        this.cashbox = cashbox;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
