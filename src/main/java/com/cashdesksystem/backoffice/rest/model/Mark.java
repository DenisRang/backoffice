
package com.cashdesksystem.backoffice.rest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msg",
    "type",
    "ser",
    "num",
    "acl_code",
    "name",
    "alc",
    "volume",
    "producer",
    "inn",
    "kpp",
    "valid",
    "has_product_info",
    "has_chain",
    "store_block_msg",
    "stores"
})
public class Mark {

    @JsonProperty("msg")
    private String msg;
    @JsonProperty("type")
    private String type;
    @JsonProperty("ser")
    private String ser;
    @JsonProperty("num")
    private String num;
    @JsonProperty("acl_code")
    private String aclCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("alc")
    private String alc;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("producer")
    private String producer;
    @JsonProperty("inn")
    private String inn;
    @JsonProperty("kpp")
    private String kpp;
    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("has_product_info")
    private Boolean hasProductInfo;
    @JsonProperty("has_chain")
    private Boolean hasChain;
    @JsonProperty("store_block_msg")
    private String storeBlockMsg;
    @JsonProperty("stores")
    private List<Store> stores = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("ser")
    public String getSer() {
        return ser;
    }

    @JsonProperty("ser")
    public void setSer(String ser) {
        this.ser = ser;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("acl_code")
    public String getAclCode() {
        return aclCode;
    }

    @JsonProperty("acl_code")
    public void setAclCode(String aclCode) {
        this.aclCode = aclCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("alc")
    public String getAlc() {
        return alc;
    }

    @JsonProperty("alc")
    public void setAlc(String alc) {
        this.alc = alc;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @JsonProperty("producer")
    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @JsonProperty("inn")
    public String getInn() {
        return inn;
    }

    @JsonProperty("inn")
    public void setInn(String inn) {
        this.inn = inn;
    }

    @JsonProperty("kpp")
    public String getKpp() {
        return kpp;
    }

    @JsonProperty("kpp")
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @JsonProperty("valid")
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @JsonProperty("has_product_info")
    public Boolean getHasProductInfo() {
        return hasProductInfo;
    }

    @JsonProperty("has_product_info")
    public void setHasProductInfo(Boolean hasProductInfo) {
        this.hasProductInfo = hasProductInfo;
    }

    @JsonProperty("has_chain")
    public Boolean getHasChain() {
        return hasChain;
    }

    @JsonProperty("has_chain")
    public void setHasChain(Boolean hasChain) {
        this.hasChain = hasChain;
    }

    @JsonProperty("store_block_msg")
    public String getStoreBlockMsg() {
        return storeBlockMsg;
    }

    @JsonProperty("store_block_msg")
    public void setStoreBlockMsg(String storeBlockMsg) {
        this.storeBlockMsg = storeBlockMsg;
    }

    @JsonProperty("stores")
    public List<Store> getStores() {
        return stores;
    }

    @JsonProperty("stores")
    public void setStores(List<Store> stores) {
        this.stores = stores;
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
