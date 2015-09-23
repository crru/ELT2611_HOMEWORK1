<SCRIPT LANGUAGE="JavaScript">
<!--
function showFilled(Value) {
return (Value > 9) ? "" + Value : "0" + Value;
}
function StartClock24() {
TheTime = new Date;
document.clock.showTime.value = showFilled(TheTime.getHours()) + ":" +
showFilled(TheTime.getMinutes()) + ":" + showFilled(TheTime.getSeconds());
setTimeout("StartClock24()",1000)
}
//-->
</script>
<style type="text/css">
<!--
.input { font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 8pt;border-style: none }
-->
</style>
