/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ale.rainbow.s2s.events;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jouedje
 */
public enum RainbowEventName {

    RAINBOW_ONCONNECTIONCREATED("rainbow_onconnectioncreated"),
    RAINBOW_ONCONNECTIONERROR("rainbow_onconnectionerror"),
    RAINBOW_ONMESSAGERECEIVED("rainbow_onmessagereceived"),
    RAINBOW_ONMESSAGESERVERRECEIPTRECEIVED("rainbow_onmessageserverreceiptreceived"),
    RAINBOW_ONMESSAGERECEIPTRECEIVED("rainbow_onmessagereceiptreceived"),
    RAINBOW_ONMESSAGERECEIPTREADRECEIVED("rainbow_onmessagereceiptreadreceived"),
    RAINBOW_ONALLMESSAGERECEIPTRECEIVED("rainbow_onallmessagereceiptreceived"),
    RAINBOW_ONALLMESSAGERECEIPTSENT("rainbow_onallmessagereceiptsent"),
    RAINBOW_ONPRESENCECHANGED("rainbow_onpresencechanged"),
    RAINBOW_ONERROR("rainbow_onerror"),
    RAINBOW_ONBUBBLEREMOVED("rainbow_onbubbleremoved"),
    RAINBOW_ONBUBBLEINVITATIONRECEIVED("rainbow_onbubbleinvitationreceived"),
    RAINBOW_ONREADY("rainbow_onready"),
    RAINBOW_ONSTARTED("rainbow_onstarted"),
    RAINBOW_ONCONNECTED("rainbow_onconnected"),
    RAINBOW_ONSTOPPED("rainbow_onstopped"),
    RAINBOW_ONDISCONNECTED("rainbow_ondisconnected"),
    RAINBOW_ONRECONNECTING("rainbow_onreconnecting"),
    RAINBOW_ONFAILED("rainbow_onfailed"),
    RAINBOW_ONBUBBLEAFFILIATIONCHANGED("rainbow_onbubbleaffiliationchanged"),
    RAINBOW_ONCONVERSATIONREMOVED("rainbow_onconversationremoved"),
    RAINBOW_ONCONVERSATIONCREATED("rainbow_onconversationcreated"),
    RAINBOW_ONCONVERSATIONUPDATE("rainbow_onconversationupdate"),
    RAINBOW_ONCHATSTATE("rainbow_onchatstate"),
    RAINBOW_ONRECEIPT("rainbow_onreceipt"),
    UNKNOWN("unknown");
    private final String eventName;

    RainbowEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getName() {
        return eventName;
    }

    //Lookup table
    private static final Map<String, RainbowEventName> lookup = new HashMap();

    //Populate the lookup table on loading time
    static {
        for (RainbowEventName ren : RainbowEventName.values()) {
            lookup.put(ren.getName(), ren);
        }
    }

    //This method can be used for reverse lookup purpose
    public static RainbowEventName get(String eventName) {
        return (lookup.containsKey(eventName)) ? lookup.get(eventName) : lookup.get("unknown");
    }
}
