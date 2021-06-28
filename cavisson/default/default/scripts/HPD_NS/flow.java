/*-----------------------------------------------------------------------------
    Name: flow
    Recorded By: cavisson
    Date of recording: 06/28/2021 01:50:43
    Flow details:
    Build details: 4.6.1 (build# 27)
    Modification History:
-----------------------------------------------------------------------------*/

package com.cavisson.scripts.HPD_NS;
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
        status = nsApi.ns_page_think_time(40.892);

        //Page Auto split for Image Link 'Login' Clicked by User
        status = nsApi.ns_start_transaction("login");
        status = nsApi.ns_web_url ("login",
            "URL=http://10.10.30.207:8080/cgi-bin/login?userSession=75893.0884568651DQADHfApHDHfcDtccpfAttcf&username=cavisson&password=cavisson&login.x=43&login.y=13&JSFormSubmit=off",
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
        status = nsApi.ns_page_think_time(1.677);

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
        status = nsApi.ns_page_think_time(0.91);

        //Page Auto split for Image Link 'findFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight");
        status = nsApi.ns_web_url ("findflight",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?depart=Acapulco&departDate=07-01-2021&arrive=Acapulco&returnDate=07-02-2021&numPassengers=1&seatPref=None&seatType=Coach&findFlights.x=78&findFlights.y=14",
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
  /*  
    //Page Auto split for Method = POST
        status = nsApi.ns_start_transaction("json");
        status = nsApi.ns_web_url ("json",
            "URL=https://update.googleapis.com/service/update2/json?cup2key=10:2998740462&cup2hreq=f76a2848b329b956ef771fc281ea1f09617fad16645535f394cc2f98a0da9e3c",
            "METHOD=POST",
            "HEADER=X-Goog-Update-AppId:giekcmmlnklenlaomppkphknjmnnpneh,gcmjkmgdlgnkkcocmoeiminaijmmjnii,cmahhnpholdijhjokonmfdjbfmklppij,obedbbhbpmojnkanicioggnmelmoomoc,oimompecagnajdejgnnjijobebaeigek,llkgjffcdpffmhiakmfcdcblohccpfmo,jflookgnkcckhobaglndicnbbgbonegd,aemomkdncapdnfajjbbcbdebjljbpmpj,jamhcnnkihinmdlkakkaopbjbbcngflc,eeigpngbgcognadeebkilcpcaedhellh,pdafiollngonhoadbmdoemagnfpdphbe,hfnkpimlhhgieaddgfemjhofmfblmnib,khaoiebndkojlmppeemjhbpbandiljpe,ojhpjlocmbogdgmfpkhlaaeamibhnphh,ggkkehgbnfjpeggfpleeakpidbkibbmn",
            "HEADER=X-Goog-Update-Interactivity:bg",
            "HEADER=X-Goog-Update-Updater:chromium-90.0.4430.93",
            "HEADER=Content-Type:application/json",
            "HEADER=Sec-Fetch-Site:none",
            "HEADER=Sec-Fetch-Mode:no-cors",
            "HEADER=Sec-Fetch-Dest:empty",
            BODY_BEGIN,
                "{"request":{"@os":"win","@updater":"chromium","acceptformat":"crx2,crx3","app":[{"appid":"giekcmmlnklenlaomppkphknjmnnpneh","cohort":"1:j5l:","cohorthint":"Auto","cohortname":"Auto","enabled":true,"packages":{"package":[{"fp":"1.fd515ec0dc30d25a09641b8b83729234bc50f4511e35ce17d24fd996252eaace"}]},"ping":{"ping_freshness":"{9a187230-ce77-497c-bc07-8cd6345e19f0}","rd":5289},"updatecheck":{},"version":"7"},{"appid":"gcmjkmgdlgnkkcocmoeiminaijmmjnii","cohort":"1:bm1:1069@0.01,1089@0.1","cohorthint":"M54ToM99","cohortname":"M54ToM99","enabled":true,"packages":{"package":[{"fp":"1.91ee417000553ca22ed67530545c4177a08e7ffcf602c292a71bd89ecd0568a5"}]},"ping":{"ping_freshness":"{d04fd2f2-ca06-4b95-985d-1820c2e77118}","rd":5289},"updatecheck":{},"version":"9.28.0"},{"appid":"cmahhnpholdijhjokonmfdjbfmklppij","cohort":"1:wr3:","cohorthint":"Auto","enabled":true,"packages":{"package":[{"fp":"1.b4ddbdce4f8d5c080328aa34c19cb533f2eedec580b5d97dc14f74935e4756b7"}]},"ping":{"ping_freshness":"{f9c756a2-d14f-4527-b1be-078b4a753e00}","rd":5289},"updatecheck":{},"version":"1.0.6"},{"accept_locale":"ENUS","appid":"obedbbhbpmojnkanicioggnmelmoomoc","cohort":"1:s6f:","cohorthint":"Auto","enabled":true,"packages":{"package":[{"fp":"1.136730aca24c6be2ccb09d6c753d039e4669866ad71362cdbaa0f1ac3bee09a8"}]},"ping":{"ping_freshness":"{e37e0d5a-e607-4fdf-b13e-e7f379eba9cb}","rd":5289},"updatecheck":{},"version":"20210618.380321574"},{"appid":"oimompecagnajdejgnnjijobebaeigek","cohort":"1::","enabled":true,"packages":{"package":[{"fp":"1.3a7afafe965da76cea59344022f69dcb9eaaef382ce56eb1daa8d20f9ec80c16"}]},"ping":{"ping_freshness":"{39b9fcf0-0546-4911-a34b-ad2ba9518456}","rd":5289},"updatecheck":{},"version":"4.10.1610.0"},{"appid":"llkgjffcdpffmhiakmfcdcblohccpfmo","cohort":"1::","enabled":true,"ping":{"ping_freshness":"{4cbccc50-00b3-4bbb-afa9-569596e14e96}","rd":5289},"updatecheck":{},"version":"0.0.0.0"},{"appid":"jflookgnkcckhobaglndicnbbgbonegd","cohort":"1:s7x:","cohorthint":"Auto","cohortname":"Auto","enabled":true,"ping":{"ping_freshness":"{d9b685ed-4510-4fd7-8d64-acd62204ff4f}","rd":5289},"updatecheck":{},"version":"0.0.0.0"},{"appid":"aemomkdncapdnfajjbbcbdebjljbpmpj","cohort":"1::","enabled":true,"ping":{"ping_freshness":"{9ecaff1f-287f-43f3-9c72-14ea2695ff29}","rd":5289},"updatecheck":{},"version":"1.0.5.0"},{"appid":"jamhcnnkihinmdlkakkaopbjbbcngflc","cohort":"1:wvr:","cohorthint":"Auto","enabled":true,"ping":{"ping_freshness":"{2eb356df-19fd-4403-b836-94eeaf94e74d}","rd":5289},"updatecheck":{},"version":"0.0.0.0"},{"appid":"eeigpngbgcognadeebkilcpcaedhellh","cohort":"1:w59:","cohorthint":"Auto","enabled":true,"ping":{"ping_freshness":"{9695783a-8049-4fc1-a475-fac8a935a4e1}","rd":5289},"updatecheck":{},"version":"0.0.0.0"},{"appid":"pdafiollngonhoadbmdoemagnfpdphbe","cohort":"1:vz3:","cohorthint":"Auto","enabled":true,"ping":{"ping_freshness":"{804d8a03-f52c-479f-8f89-326a4e12d3c6}","rd":5289},"updatecheck":{},"version":"0.0.0.0"},{"appid":"hfnkpimlhhgieaddgfemjhofmfblmnib","cohort":"1:jcl:","cohorthint":"Auto","cohortname":"Auto","enabled":true,"packages":{"package":[{"fp":"1.f27d039a2ab0b1cd25921755fc43103664cb88a7f69a765388e7e77d8650a8b7"}]},"ping":{"ping_freshness":"{ead2621c-c5da-4bab-a9d4-fd27dfd497e9}","rd":5289},"updatecheck":{},"version":"6691"},{"appid":"khaoiebndkojlmppeemjhbpbandiljpe","cohort":"1:cux:","cohorthint":"Auto","cohortname":"Auto","enabled":true,"packages":{"package":[{"fp":"1.ffd1d2d75a8183b0a1081bd03a7ce1d140fded7a9fb52cf3ae864cd4d408ceb4"}]},"ping":{"ping_freshness":"{c72dad70-06c4-4cdd-9edc-b5a2c916a77a}","rd":5289},"updatecheck":{},"version":"43"},{"appid":"ojhpjlocmbogdgmfpkhlaaeamibhnphh","cohort":"1:w0x:","cohorthint":"Auto","enabled":true,"packages":{"package":[{"fp":"1.478aa915e78878e332a0b4bb4d2a6fb67ff1c7f7b62fe906f47095ba5ae112d0"}]},"ping":{"ping_freshness":"{b7b479a0-f66d-48b4-bbf1-1f3e06a5af7a}","rd":5289},"updatecheck":{},"version":"1"},{"appid":"ggkkehgbnfjpeggfpleeakpidbkibbmn","cohort":"1:ut9:","cohorthint":"M80ToM99","enabled":true,"packages":{"package":[{"fp":"1.e03336cad15559578407db3fc7c08de34022cd38341bcf10f88b6ff93cf0d9b9"}]},"ping":{"ping_freshness":"{f0cec4a0-b3d4-4c62-bc57-e4a8e7fe191d}","rd":5289},"updatecheck":{},"version":"2021.6.21.1141"}],"arch":"x64","dedup":"cr","domainjoined":false,"hw":{"physmemory":12},"lang":"en-US","nacl_arch":"x86-64","os":{"arch":"x86_64","platform":"Windows","version":"10.0.18363.1621"},"prodversion":"90.0.4430.93","protocol":"3.1","requestid":"{7c83aaf7-1404-4e5f-8b61-13ead27d886a}","sessionid":"{c8186b84-c6bc-48f3-ad5a-0d1d3787df07}","updaterversion":"90.0.4430.93"}}",
            BODY_END
        );

        status = nsApi.ns_end_transaction("json", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(1.661);
*/
        //Page Auto split for Image Link 'reserveFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_2");
        status = nsApi.ns_web_url ("findflight_2",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?outboundFlight=button0&hidden_outboundFlight_button0=000%7C0%7C07-01-2021&hidden_outboundFlight_button1=001%7C0%7C07-01-2021&hidden_outboundFlight_button2=002%7C0%7C07-01-2021&hidden_outboundFlight_button3=003%7C0%7C07-01-2021&numPassengers=1&advanceDiscount=&seatType=Coach&seatPref=None&reserveFlights.x=101&reserveFlights.y=8",
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
        status = nsApi.ns_page_think_time(2.152);

        //Page Auto split for Image Link 'buyFlights' Clicked by User
        status = nsApi.ns_start_transaction("findflight_3");
        status = nsApi.ns_web_url ("findflight_3",
            "URL=http://10.10.30.207:8080/cgi-bin/findflight?firstName=Tiger&lastName=Scott&address1=4261+Stevenson+Blvd.&address2=Fremont%2C+CA+94538&pass1=Scott+Tiger&creditCard=&expDate=&oldCCOption=&numPassengers=1&seatType=Coach&seatPref=None&outboundFlight=000%7C0%7C07-01-2021&advanceDiscount=&buyFlights.x=51&buyFlights.y=18&.cgifields=saveCC",
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
        status = nsApi.ns_page_think_time(11.331);

        //Page Auto split for Image Link 'SignOff Button' Clicked by User
        status = nsApi.ns_start_transaction("welcome");
        status = nsApi.ns_web_url ("welcome",
            "URL=http://10.10.30.207:8080/cgi-bin/welcome",
            "HEADER=Upgrade-Insecure-Requests:1",
            "HEADER=Accept-Language:en-US,en;q=0.9",
            INLINE_URLS,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/banner_animated.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/sun_swede.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/Merc10-dev/images/login.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/images/banner_merctur.jpg", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE,
                "URL=http://10.10.30.207:8080/tours/vep/images/velocigen.gif", "HEADER=Accept-Language:en-US,en;q=0.9", END_INLINE
        );

        status = nsApi.ns_end_transaction("welcome", NS_AUTO_STATUS);
        status = nsApi.ns_page_think_time(1.815);

        return status;
    }
}
