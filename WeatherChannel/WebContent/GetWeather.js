$(document).ready(function() {
    $.ajax({
    	type: "GET",
        url: "http://localhost:8080/WeatherChannel/rest/WeatherChannel/Dover,NH/7feae0cef640428d9fa232900172412",
        dataType: "json",
        success: function(data){
        	$(".location-name").append(data.location.name);
            $(".location-region").append(data.location.region);
            $(".location-country").append(data.location.country);
            $(".location-lat").append(data.location.lat);
            $(".location-lon").append(data.location.lon);
            $(".location-tz_id").append(data.location.tz_id);
            $(".location-localtime_epoch").append(data.location.localtime_epoch);
            $(".location-localtime").append(data.location.localtime);
        }
    })
});