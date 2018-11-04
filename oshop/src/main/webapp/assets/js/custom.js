/**
 * Function to solve the active menu problem of the template
 */

$(function() {
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}

});