
package Placementlog.Core;
//class to control the behaviour of the treeview 'tvOverview'

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class OverviewControl {
    
    public DefaultMutableTreeNode addObject(String child, JTree tree, DefaultMutableTreeNode rootNode, DefaultTreeModel treeModel) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = tree.getSelectionPath();
        
        if(parentPath == null) {
            parentNode = rootNode;
        } else {
            parentNode = (DefaultMutableTreeNode) parentPath.getLastPathComponent();
        }
        return addObject(parentNode, child, tree, true, treeModel);
    }
    
    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent, String child, JTree tree, boolean shouldBeVisible, DefaultTreeModel treeModel ) {
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child);
        treeModel.insertNodeInto(childNode, parent, parent.getChildCount() );
        if(shouldBeVisible) {
            tree.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
}
