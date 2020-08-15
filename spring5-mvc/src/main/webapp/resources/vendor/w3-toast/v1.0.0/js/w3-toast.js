function w3toast(msg) {
	// Get the snackbar DIV
	var x = document.getElementById("w3-toast");
  
	if( x ) {
		x.innerHTML = msg;
	  
		// Add the "show" class to DIV
		x.className = "show";
	  
		// After 3 seconds, remove the show class from DIV
		setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	}
}