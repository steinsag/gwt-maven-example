package de.hpfsc.web;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see de.hpfsc.web.GreetingService
     */
    void greetServer( java.lang.String name, AsyncCallback<java.lang.String> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static GreetingServiceAsync instance;

        public static final GreetingServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (GreetingServiceAsync) GWT.create( GreetingService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
