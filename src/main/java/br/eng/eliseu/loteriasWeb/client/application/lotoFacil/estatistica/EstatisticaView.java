package br.eng.eliseu.loteriasWeb.client.application.lotoFacil.estatistica;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class EstatisticaView extends ViewImpl implements EstatisticaPresenter.MyView {
    interface Binder extends UiBinder<Widget, EstatisticaView> {
    }

    @UiField SimplePanel estatistica;

    @Inject
    EstatisticaView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    

}