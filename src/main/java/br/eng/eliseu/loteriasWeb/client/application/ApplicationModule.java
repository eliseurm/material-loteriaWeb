package br.eng.eliseu.loteriasWeb.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import br.eng.eliseu.loteriasWeb.client.application.home.HomeModule;
import br.eng.eliseu.loteriasWeb.client.application.lotoFacil.concursos.ConcursosModule;
import br.eng.eliseu.loteriasWeb.client.application.lotoFacil.estatistica.EstatisticaModule;

public class ApplicationModule extends AbstractPresenterModule {
	
    @Override
    protected void configure() {
    	
		install(new HomeModule());
		install(new EstatisticaModule());
        install(new ConcursosModule());
		

		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class, ApplicationPresenter.MyProxy.class);
    }
}
