// EXAMPLE 1
var startstopTimer, startstopCurrent = 0, totalTime = 0;
$(document).ready(function() {
	startstopTimer = $.timer(function() {
		var min = parseInt(startstopCurrent/6000);
		var sec = parseInt(startstopCurrent/100)-(min*60);
		var output = "00"; if(min > 0) {output = pad(min,2);}
		$('.startstoptime').html(output+":"+pad(sec,2));
		startstopCurrent+=7;
                if( min<1) {
                    totalTime = 1;
                }
                else if(min>=1 && sec <= 30){
                    totalTime = min;
                }
                else {
                    totalTime = min+1;
                }
                
	}, 70, false);
});

function startstopReset() {
    var totalMInput = document.getElementById('prForm:itLength');
  
    if(totalMInput.getAttribute('disabled') != 'disabled' && totalTime != 0) {
    
       totalMInput.value = totalTime;
    }
        
    //startstopCurrent = 0;
    startstopTimer.stop().once();
}

// Padding function
function pad(number, length) {
	var str = '' + number;
	while (str.length < length) {str = '0' + str;}
	return str;
}