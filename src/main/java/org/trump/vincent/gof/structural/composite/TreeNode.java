package org.trump.vincent.gof.structural.composite;

import java.util.List;

public interface TreeNode {

    void addSubNode(TreeNode sunNode);

    void addSubNodes(List<TreeNode> subNodes);
}
