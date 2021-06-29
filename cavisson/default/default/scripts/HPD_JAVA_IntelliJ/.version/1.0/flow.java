/*-----------------------------------------------------------------------------
    Name: flow
    Recorded By: cavisson
    Date of recording: 06/29/2021 06:17:10
    Flow details:
    Build details: 4.6.1 (build# 312)
    Modification History:
-----------------------------------------------------------------------------*/

package HPD_JAVA_IntelliJ;
import pacJnvmApi.NSApi;

public class flow implements NsFlow
{
    public int execute(NSApi nsApi) throws Exception
    {
        int status = 0;

        status = nsApi.ns_start_transaction("index_html");
        status = nsApi.ns_web_url ("index_html",
            "URL=http://10.10.30.207:8080/tours/index.html",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/login.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/banner_merctur.jpg", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("index_html", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(25.251);

        //Page Auto split for Image Link 'Login' Clicked by User
        status = nsApi.ns_start_transaction("login");
        status = nsApi.ns_web_url ("login",
            "URL=http://10.10.30.207:8080/cgi-bin/login?userSession=75893.0884568651DQADHfApHDHfcDtccpfAttcf&username=cavisson&password=cavisson&login.x=64&login.y=9&JSFormSubmit=off",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/flights.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/home.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/signoff.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/banner_merctur.jpg", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("login", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(3.879);

        //Page Auto split for Image Link 'Search Flights Button' Clicked by User
        status = nsApi.ns_start_transaction("reservation");
        status = nsApi.ns_web_url ("reservation",
            "URL=http://10.10.30.207:8080/cgi-bin/reservation",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/flights.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/home.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/signoff.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/splash_Findflight.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/continue.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("reservation", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(0.939);

        //Page Auto split for Image Link 'findFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight");
        status = nsApi.ns_web_url ("findflight",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?depart=Acapulco&departDate=07-01-2021&arrive=Acapulco&returnDate=07-02-2021&numPassengers=1&seatPref=None&seatType=Coach&findFlights.x=17&findFlights.y=11",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/flights.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/home.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/signoff.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/splash_Searchresults.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/continue.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/startover.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(0.768);

        //Page Auto split for Image Link 'reserveFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_2");
        status = nsApi.ns_web_url ("findflight_2",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?outboundFlight=button0&hidden_outboundFlight_button0=000%7C0%7C07-01-2021&hidden_outboundFlight_button1=001%7C0%7C07-01-2021&hidden_outboundFlight_button2=002%7C0%7C07-01-2021&hidden_outboundFlight_button3=003%7C0%7C07-01-2021&numPassengers=1&advanceDiscount=&seatType=Coach&seatPref=None&reserveFlights.x=84&reserveFlights.y=13",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/flights.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/home.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/signoff.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/splash_creditcard.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/purchaseflight.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/startover.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight_2", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(2.331);

        //Page Auto split for Image Link 'buyFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_3");
        status = nsApi.ns_web_url ("findflight_3",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?firstName=Tiger&lastName=Scott&address1=4261+Stevenson+Blvd.&address2=Fremont%2C+CA+94538&pass1=Scott+Tiger&creditCard=&expDate=&oldCCOption=&numPassengers=1&seatType=Coach&seatPref=None&outboundFlight=000%7C0%7C07-01-2021&advanceDiscount=&buyFlights.x=88&buyFlights.y=9&.cgifields=saveCC",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/flights.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/home.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/signoff.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/splash_flightconfirm.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/bookanother.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("findflight_3", NS_AUTO_STATUS);
    status = nsApi.ns_page_think_time(0.768);
    return status;
    }
}
