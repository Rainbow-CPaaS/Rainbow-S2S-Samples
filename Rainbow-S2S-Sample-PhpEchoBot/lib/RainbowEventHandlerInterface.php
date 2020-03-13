<?php
namespace Ale\Rainbow\S2S\Webhook;

interface RainbowEventHandlerInterface{
        public function rainbow_onconnectioncreated($data);
        public function rainbow_onconnectionerror($data);
        public function rainbow_onmessagereceived($data);
        public function rainbow_onmessageserverreceiptreceived($data);
        public function rainbow_onmessagereceiptreceived($data);
        public function rainbow_onmessagereceiptreadreceived($data);
        public function rainbow_onallmessagereceiptreceived($data);
        public function rainbow_onallmessagereceiptsent($data);
        public function rainbow_onpresencechanged($data);
        public function rainbow_onerror($data);
        public function rainbow_onbubbleremoved($data);
        public function rainbow_onbubbleinvitationreceived($data);
        public function rainbow_onready($data);
        public function rainbow_onstarted($data);
        public function rainbow_onconnected($data);
        public function rainbow_onstopped($data);
        public function rainbow_ondisconnected($data);
        public function rainbow_onreconnecting($data);
        public function rainbow_onfailed($data);
        public function rainbow_onbubbleaffiliationchanged($data);
        public function rainbow_onconversationremoved($data);
        public function rainbow_onconversationcreated($data);
        public function rainbow_onconversationupdate($data);
        public function rainbow_onchatstate($data);
        public function rainbow_onreceipt($data);
}
