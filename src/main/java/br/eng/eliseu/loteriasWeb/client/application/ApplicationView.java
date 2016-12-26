package br.eng.eliseu.loteriasWeb.client.application;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialSearch;
import gwt.material.design.client.ui.MaterialToast;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
	
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField MaterialContainer container;
    @UiField MaterialNavBar navBar, navBarSearch; 

    @UiField MaterialSearch txtSearch;

    @Inject
    ApplicationView( Binder uiBinder) {
    	
        initWidget(uiBinder.createAndBindUi(this));
        
        // --- Define o container do SLOT_MAIN
        bindSlot(ApplicationPresenter.SLOT_MAIN, container);
        
        txtSearch.addCloseHandler(event -> {
            navBar.setVisible(true);
            navBarSearch.setVisible(false);
        });
        
        txtSearch.addSearchFinishHandler(event -> MaterialToast.fireToast("You search : " + txtSearch.getSelectedObject().getKeyword()));
    }

    @UiHandler("btnSearch")
    void onSearch(ClickEvent e) {
        navBar.setVisible(false);
        navBarSearch.setVisible(true);
    }

}
