package br.eng.eliseu.loteriasWeb.client.application.lotoFacil.concursos;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ConcursosModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ConcursosPresenter.class, ConcursosPresenter.MyView.class, ConcursosView.class, ConcursosPresenter.MyProxy.class);
    }
}