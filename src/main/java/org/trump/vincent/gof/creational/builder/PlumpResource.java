package org.trump.vincent.gof.creational.builder;

/**
 * Created by Vincent on 2017/12/21 0021.
 */

/**
 * GOF- Builder Design pattern
 * @Reference http://www.jianshu.com/p/e2a2fe3555b9
 */
public class PlumpResource {

    private String resourceId;

    private String name;

    private String ccid;

    private String folerId;

    private Integer lifeCycle;

    private Integer status;

    private String iconUrl;

    private String path;

    /**
     * Private Constuctor for the Plump Resource with Builder Design pattern.
     * @param resourceBuilder
     */
    private PlumpResource(ResourceBuilder resourceBuilder){
        this.resourceId = resourceBuilder.resourceId;
        this.name = resourceBuilder.name;
        this.ccid = resourceBuilder.ccid;
        this.folerId = resourceBuilder.folerId;
        this.lifeCycle = resourceBuilder.lifeCycle;
        this.status = resourceBuilder.status;
        this.iconUrl = resourceBuilder.iconUrl;
        this.path = resourceBuilder.path;
    }

    public static class ResourceBuilder{


        public ResourceBuilder(){

        }

        public PlumpResource build(){
            return new PlumpResource(this);
        }

        public ResourceBuilder setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public ResourceBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ResourceBuilder setCcid(String ccid) {
            this.ccid = ccid;
            return this;
        }

        public ResourceBuilder setFolerId(String folerId) {
            this.folerId = folerId;
            return this;
        }

        public ResourceBuilder setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }

        public ResourceBuilder setStatus(Integer status) {
            this.status = status;
            return this;
        }

        public ResourceBuilder setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public ResourceBuilder setPath(String path) {
            this.path = path;
            return this;
        }

        /**
         * Same properties with builer target (PlumpResource)
         */
        private String resourceId;

        private String name;

        private String ccid;

        private String folerId;

        private Integer lifeCycle;

        private Integer status;

        private String iconUrl;

        private String path;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getName() {
        return name;
    }

    public String getCcid() {
        return ccid;
    }

    public String getFolerId() {
        return folerId;
    }

    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public Integer getStatus() {
        return status;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getPath() {
        return path;
    }
}
