package br.eng.eliseu.loteriasWeb.client.application.lotoFacil.estatistica;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class EstatisticaModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(EstatisticaPresenter.class, EstatisticaPresenter.MyView.class, EstatisticaView.class, EstatisticaPresenter.MyProxy.class);
    }
}