package br.eng.eliseu.loteriasWeb.client.gin;

import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter;

import br.eng.eliseu.loteriasWeb.client.application.ApplicationModule;
import br.eng.eliseu.loteriasWeb.client.application.home.HomeModule;
import br.eng.eliseu.loteriasWeb.client.application.lotoFacil.concursos.ConcursosModule;
import br.eng.eliseu.loteriasWeb.client.application.lotoFacil.estatistica.EstatisticaModule;
import br.eng.eliseu.loteriasWeb.client.place.NameTokens;
import br.eng.eliseu.loteriasWeb.client.resources.ResourceLoader;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
    	
        install(new DefaultModule.Builder()
            	.tokenFormatter(RouteTokenFormatter.class)
            	.build());

        install(new ApplicationModule());
		install(new HomeModule());
        install(new ConcursosModule());
		install(new EstatisticaModule());
		

        bind(ResourceLoader.class).asEagerSingleton();

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.HOME);

    }
}
