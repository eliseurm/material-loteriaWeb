package br.eng.eliseu.loteriasWeb.client.application.lotoFacil.concursos;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class ConcursosView extends ViewImpl implements ConcursosPresenter.MyView {
    interface Binder extends UiBinder<Widget, ConcursosView> {
    }

    @UiField
    SimplePanel main;

    @Inject
    ConcursosView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    

}