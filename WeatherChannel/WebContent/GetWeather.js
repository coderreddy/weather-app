$(function(){
	$(".btn1").click(function(){
		var city = $("#city").val();
		var key = $("#key").val();
		function mapValue(x)
		{
			var status = x;
			 //set the image based on the weather status
		    $("div#current,div#location").css("background-image",function(){
		    	if(status === "Partly cloudy")
		    		{
		    		return "url(cloudy.jpg)";
		    		}
		    	else if(status === "Sunny")
		    		{
		    		return "url(sunny.jpg)";
		    		}
		    	else if(status === "Clear")
		    		{
		    		return "url(clear.jpg)";
		    		}
		    });
		}
		
    $.ajax({
    	type: "GET",
        url: "http://localhost:8080/WeatherChannel/rest/WeatherChannel/"+ city +"/"+ key,
        dataType: "json",
        success: function(data){
        	mapValue(data.current.condition.text);
        	$(".last_updated").text("LAST UPDATED: " +data.current.last_updated);
            $(".temp_c").text("TEMP_C: " +data.current.temp_c);
            $(".temp_f").text("TEMP_F: "+data.current.temp_f);
            $(".condition").text("WEATHER_CONDITION: "+data.current.condition.text);
            $(".wind_mph").text("WIND_MPH: "+data.current.wind_mph);
            $(".feelslike_c").text("FEELS LIKE: "+data.current.feelslike_c);
            $(".vis_miles").text("VISIBILITY: "+data.current.vis_miles);
            
        	$(".location-name").text("NAME: "+data.location.name);
            $(".location-region").text("REGION: "+data.location.region);
            $(".location-country").text("COUNTRY: "+data.location.country);
            $(".location-lat").text("LATITUDE: "+data.location.lat);
            $(".location-lon").text("LONGITUDE: "+data.location.lon);
            $(".location-tz_id").text("TZ_ID: "+data.location.tz_id);
            $(".location-localtime").text("LOCALTIME: "+data.location.localtime);
        	}
    	});
	});
});