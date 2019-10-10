/*
@license

dhtmlxGantt v.6.2.6 Standard

This version of dhtmlxGantt is distributed under GPL 2.0 license and can be legally used in GPL projects.

To use dhtmlxGantt in non-GPL projects (and get Pro version of the product), please obtain Commercial/Enterprise or Ultimate license on our site https://dhtmlx.com/docs/products/dhtmlxGantt/#licensing or contact us at sales@dhtmlx.com

(c) XB Software Ltd.

*/
!function(t,n){if("object"==typeof exports&&"object"==typeof module)module.exports=n();else if("function"==typeof define&&define.amd)define([],n);else{var e=n();for(var i in e)("object"==typeof exports?exports:t)[i]=e[i]}}(window,function(){return function(t){var n={};function e(i){if(n[i])return n[i].exports;var o=n[i]={i:i,l:!1,exports:{}};return t[i].call(o.exports,o,o.exports,e),o.l=!0,o.exports}return e.m=t,e.c=n,e.d=function(t,n,i){e.o(t,n)||Object.defineProperty(t,n,{enumerable:!0,get:i})},e.r=function(t){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},e.t=function(t,n){if(1&n&&(t=e(t)),8&n)return t;if(4&n&&"object"==typeof t&&t&&t.__esModule)return t;var i=Object.create(null);if(e.r(i),Object.defineProperty(i,"default",{enumerable:!0,value:t}),2&n&&"string"!=typeof t)for(var o in t)e.d(i,o,function(n){return t[n]}.bind(null,o));return i},e.n=function(t){var n=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(n,"a",n),n},e.o=function(t,n){return Object.prototype.hasOwnProperty.call(t,n)},e.p="/codebase/",e(e.s=216)}({216:function(t,n){function e(){var t=gantt.$task_data;return t&&t.offsetHeight&&t.offsetWidth?{parent:t,viewport:gantt.$task}:(t=gantt.$grid_data)&&t.offsetHeight&&t.offsetWidth?{parent:t,viewport:gantt.$grid}:{parent:gantt.$layout,viewport:gantt.$layout}}gantt.config.quickinfo_buttons=["icon_delete","icon_edit"],gantt.config.quick_info_detached=!0,gantt.config.show_quick_info=!0,gantt.attachEvent("onTaskClick",function(t){return setTimeout(function(){gantt.showQuickInfo(t)},0),!0}),function(){for(var t=["onEmptyClick","onViewChange","onLightbox","onBeforeTaskDelete","onBeforeDrag"],n=function(){return gantt._hideQuickInfo(),!0},e=0;e<t.length;e++)gantt.attachEvent(t[e],n)}(),function(){function t(){return gantt.hideQuickInfo(!0),gantt._quick_info_box=null,!0}gantt.attachEvent("onGanttReady",t),gantt.attachEvent("onDestroy",t)}(),gantt.templates.quick_info_title=function(t,n,e){return e.text.substr(0,50)},gantt.templates.quick_info_content=function(t,n,e){return e.details||e.text},gantt.templates.quick_info_date=function(t,n,e){return gantt.templates.task_time(t,n,e)},gantt.templates.quick_info_class=function(t,n,e){return""},gantt.showQuickInfo=function(t){if((t!=this._quick_info_box_id||!gantt.utils.dom.isChildOf(this._quick_info_box,document.body))&&this.config.show_quick_info){this.hideQuickInfo(!0);var n=e(),i=this._get_event_counter_part(t,6,n.viewport);i&&(this._quick_info_box=this._init_quick_info(i,t),this._quick_info_task=t,this._quick_info_box.className=gantt._prepare_quick_info_classname(t),this._fill_quick_data(t),this._show_quick_info(i,6),this.callEvent("onQuickInfo",[t]))}},gantt._hideQuickInfo=function(){gantt.hideQuickInfo()},gantt.hideQuickInfo=function(t){var n=this._quick_info_box;this._quick_info_box_id=0;var e=this._quick_info_task;if(this._quick_info_task=null,n&&n.parentNode){if(gantt.config.quick_info_detached)return this.callEvent("onAfterQuickInfo",[e]),n.parentNode.removeChild(n);n.className+=" gantt_qi_hidden","auto"==n.style.right?n.style.left="-350px":n.style.right="-350px",t&&(n.style.left=n.style.right="",n.parentNode.removeChild(n)),this.callEvent("onAfterQuickInfo",[e])}},gantt.event(window,"keydown",function(t){27==t.keyCode&&gantt.hideQuickInfo()}),gantt._show_quick_info=function(t,n){var i=gantt._quick_info_box;if(gantt.config.quick_info_detached){var o=e();i.parentNode&&"#document-fragment"!=i.parentNode.nodeName.toLowerCase()||o.parent.appendChild(i);var a=i.offsetWidth,c=i.offsetHeight,f=gantt.getScrollState(),_=o.viewport.offsetWidth+f.x-a;i.style.left=Math.min(Math.max(f.x,t.left-t.dx*(a-t.width)),_)+"px",i.style.top=t.top-(t.dy?c+t.height+2*n:0)+"px"}else i.style.top="20px",1==t.dx?(i.style.right="auto",i.style.left="-300px",setTimeout(function(){i.style.left="10px"},1)):(i.style.left="auto",i.style.right="-300px",setTimeout(function(){i.style.right="10px"},1)),i.className+=" gantt_qi_"+(1==t.dx?"left":"right"),gantt.$root.appendChild(i)},gantt._prepare_quick_info_classname=function(t){var n=gantt.getTask(t),e="gantt_cal_quick_info",i=this.templates.quick_info_class(n.start_date,n.end_date,n);return i&&(e+=" "+i),e},gantt._init_quick_info=function(t,n){var i=gantt.getTask(n);if("boolean"==typeof this._quick_info_readonly&&this.isReadonly(i)!==this._quick_info_readonly&&(gantt.hideQuickInfo(!0),this._quick_info_box=null),this._quick_info_readonly=this.isReadonly(i),!this._quick_info_box){var o=this._quick_info_box=document.createElement("div");this._waiAria.quickInfoAttr(o);var a='<div class="gantt_cal_qi_title" '+(r=gantt._waiAria.quickInfoHeaderAttrString())+'><div class="gantt_cal_qi_tcontent"></div><div  class="gantt_cal_qi_tdate"></div></div><div class="gantt_cal_qi_content"></div>';a+='<div class="gantt_cal_qi_controls">';for(var c=gantt.config.quickinfo_buttons,f={icon_delete:!0,icon_edit:!0},_=0;_<c.length;_++)if(!this._quick_info_readonly||!f[c[_]]){var r=gantt._waiAria.quickInfoButtonAttrString(gantt.locale.labels[c[_]]);a+='<div class="gantt_qi_big_icon '+c[_]+'" title="'+gantt.locale.labels[c[_]]+'" '+r+"><div class='gantt_menu_icon "+c[_]+"'></div><div>"+gantt.locale.labels[c[_]]+"</div></div>"}a+="</div>",o.innerHTML=a;if(gantt.event(o,"click",function(t){t=t||event,gantt._qi_button_click(t.target||t.srcElement)}),gantt.event(o,"keypress",function(t){var n=(t=t||event).which||event.keyCode;13!=n&&32!=n||setTimeout(function(){gantt._qi_button_click(t.target||t.srcElement)},1)}),gantt.config.quick_info_detached){var u=e();gantt.event(u,"scroll",function(){gantt.hideQuickInfo()})}}return this._quick_info_box},gantt._qi_button_click=function(t){var n=gantt._quick_info_box;if(t&&t!=n){var e=t.className;if(-1!=e.indexOf("_icon")){var i=gantt._quick_info_box_id;gantt.$click.buttons[e.split(" ")[1].replace("icon_","")](i)}else gantt._qi_button_click(t.parentNode)}},gantt._get_event_counter_part=function(t,n,e){var i=gantt.getTaskNode(t);if(!i&&!(i=gantt.getTaskRowNode(t)))return null;var o=0,a=n+i.offsetTop+i.offsetHeight,c=i;if(this.utils.dom.isChildOf(c,e))for(;c&&c!==e;)o+=c.offsetLeft,c=c.offsetParent;var f=this.getScrollState();return c?{left:o,top:a,dx:o+i.offsetWidth/2-f.x>gantt.$container.offsetWidth/2?1:0,dy:a+i.offsetHeight/2-f.y>gantt.$container.offsetHeight/2?1:0,width:i.offsetWidth,height:i.offsetHeight}:null},gantt._fill_quick_data=function(t){var n=gantt.getTask(t),e=gantt._quick_info_box;gantt._quick_info_box_id=t;var i={content:gantt.templates.quick_info_title(n.start_date,n.end_date,n),date:gantt.templates.quick_info_date(n.start_date,n.end_date,n)},o=e.firstChild.firstChild;o.innerHTML=i.content,o.nextSibling.innerHTML=i.date,gantt._waiAria.quickInfoHeader(e,[i.content,i.date].join(" ")),e.firstChild.nextSibling.innerHTML=gantt.templates.quick_info_content(n.start_date,n.end_date,n)}}})});
//# sourceMappingURL=dhtmlxgantt_quick_info.js.map