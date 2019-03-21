<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
<!--     <link rel="stylesheet" href="/maps/documentation/javascript/cgc/demos.css"> -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC2ehViceNFiAwMTb1N7NdE8HLkHewtRtI"></script>
    <script type="text/javascript">
    	function getMyLocation(){
    		if(navigator.geolocation){
    			navigator.geolocation.getCurrentPosition(initMap);
    		}
    		else{
    			alert("이런 지오로케이션이 제공되지 않네요.");
    		}
    	}
    </script>
  </head>
  <body onLoad="getMyLocation()">
    <div id="map" style="width:800px;height:650px;"></div>
    <script>
      function initMap() {
        var myLatLng = {lat: 37.478681, , lng: 126.878689};

        // Create a map object and specify the DOM element
        // for display.
        var map = new google.maps.Map(document.getElementById('map'), {
          center: myLatLng,
          zoom: 16
        });

        // Create a marker and set its position.
        var marker = new google.maps.Marker({
          map: map,
          position: myLatLng,
          title: '한국소프트인재개발원'
        });
        var markerMaxWidth = 300;
        <p>내용</p><a href=http:;
        var infoWindow = new google.maps.InfoWindow({
        	content:contentString
        	,maxWidth:markerMaxWidth
        });
        google.maps.event.addListener(marker,'click',function()){
   			infoWindow.open(map,marker)
        }
        
      }

    </script>
  </body>
</html>