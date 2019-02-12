$(function(){
   $("#settingbutton").click(function(){
     $("#screentitle").html("setting");
     $("#setting").removeClass("hidesetting");
     $("#settingbutton").addClass("hidesettingbutton");
     $("#backbutton").addClass("showbackbutton");
 $("#middleappcontent").addClass("hidemiddlecontent");
   });

   $("#backbutton, footer").click(function(){
     $("#screentitle").html("Mobile App title");
     $("#backbutton").removeClass("showbackbutton");
     $("#setting").addClass("hidesetting");
     $("#settingbutton").removeClass("hidesettingbutton");
 $("#middleappcontent").removeClass("hidemiddlecontent");
   });
});
