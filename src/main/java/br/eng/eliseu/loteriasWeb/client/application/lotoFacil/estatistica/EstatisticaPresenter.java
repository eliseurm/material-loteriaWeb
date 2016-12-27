package br.eng.eliseu.loteriasWeb.client.application.lotoFacil.estatistica;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import br.eng.eliseu.loteriasWeb.client.application.ApplicationPresenter;
import br.eng.eliseu.loteriasWeb.client.place.NameTokens;
public class EstatisticaPresenter extends Presenter<EstatisticaPresenter.MyView, EstatisticaPresenter.MyProxy>  {
    interface MyView extends View  {
    }

    @ProxyStandard
    @NameToken(NameTokens.LOTOFACIL_ESTATISTICAS)
    interface MyProxy extends ProxyPlace<EstatisticaPresenter> {
    }

    @Inject
    EstatisticaPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        
    }
    
    
}