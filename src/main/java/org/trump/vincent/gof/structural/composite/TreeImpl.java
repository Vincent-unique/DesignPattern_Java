package org.trump.vincent.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeImpl implements TreeNode {

    private String key;

    private byte[] data;

    /**
     * Composite for Tree Model
     */
    private List<TreeNode> subNodes;

    public TreeImpl(){

    }

    public void addSubNode(TreeNode subNode){
        if(subNode!=null){
            if(this.subNodes==null){
                this.subNodes = new ArrayList<TreeNode>();
            }
            this.subNodes.add(subNode);
        }
    }

    public void addSubNodes(List<TreeNode> subNodes){
        if(subNodes!=null&&subNodes.size()>0){
            if(this.subNodes==null){
                this.subNodes = new ArrayList<TreeNode>();
            }
            this.subNodes.addAll(subNodes);
        }
    }


    public String getKey() {
        return key;
    }

    public TreeImpl setKey(String key) {
        this.key = key;
        return this;
    }

    public byte[] getData() {
        return data;
    }

    public TreeImpl setData(byte[] data) {
        this.data = data;
        return this;
    }

    public List<TreeNode> getSubNodes() {
        return subNodes;
    }

    public TreeImpl setSubNodes(List<TreeNode> subNodes) {
        this.subNodes = subNodes;
        return this;
    }
}
