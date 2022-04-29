import java.io.IOException;

import net.vpnblocker.api.Response;




public class VPNDetection{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		VPNDetection vpn_detection = new VPNDetection();
		new Thread(() -> {
		    String ipToLookup = "110.226.151.160";
			Response api_response = (Response) vpn_detection.getResponse(ipToLookup);
			if(api_response != null) {
			if(api_response.status.equals("success")) {
			    System.out.println("Package: " + api_response.getPackage);
			    if(api_response.getPackage.equals("Free")) {
			        System.out.println("Remaining Requests: " + api_response.remaining_requests);
			    }
			    System.out.println("IP Address: " + api_response.ipaddress);
			    System.out.println("Is this IP a VPN or Hosting Network? " + api_response.hostip);
			    System.out.println("Organisation: " + api_response.org);
			    if(api_response.country != null) {
			        System.out.println("Country: " + api_response.country.name);
			    }

			} else {
			    System.out.println("Error: " + api_response.msg);
			}
			}
		}).start();
	}

	private Object getResponse(String ipToLookup) {
		// TODO Auto-generated method stub
		return null;
	}

}
