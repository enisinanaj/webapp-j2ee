package com.sia.ipviewer.designer;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import com.sia.ipviewer.designer.nodo.NodoGaranzia;
import com.sia.ipviewer.designer.nodo.NodoProdotto;
import com.sia.ipviewer.designer.nodo.NodoType;

@Named
@SessionScoped
public class AlberoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TreeNode root;
	private TreeNode selectedNode;

	@PostConstruct
	public void init() {
		createRoot();
	}

	private void createRoot() {
		// This is the root node, so it's data is root and its parent is null
		this.root = new DefaultTreeNode(new NodoProdotto("Garanzia 0", NodoType.ROOT) , null);
		TreeNode gar1 = new DefaultTreeNode(new NodoGaranzia("Garanzia 1"), root);
		TreeNode gar2 = new DefaultTreeNode(new NodoGaranzia("Garanzia 2"), root);
		TreeNode gar3 = new DefaultTreeNode(new NodoGaranzia("Garanzia 3"), root);
		
		TreeNode gar01 = new DefaultTreeNode(new NodoGaranzia("Garanzia 11"), gar1);
		TreeNode gar21 = new DefaultTreeNode(new NodoGaranzia("Garanzia 21"), gar2);
		TreeNode gar31 = new DefaultTreeNode(new NodoGaranzia("Garanzia 31"), gar3);
	}

	public TreeNode getRoot() {
		return root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void onNodeExpand(NodeExpandEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Expanded", event.getTreeNode().toString());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeCollapse(NodeCollapseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Collapsed", event.getTreeNode().toString());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeSelect(NodeSelectEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", event.getTreeNode().toString());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeUnselect(NodeUnselectEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Unselected", event.getTreeNode().toString());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
