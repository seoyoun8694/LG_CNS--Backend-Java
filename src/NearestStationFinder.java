import java.util.HashMap;
import java.util.Map;

public class NearestStationFinder {
    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371.0;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

    public static void main(String[] args) {
        double userLat = 37.5118239121138;
        double userLon = 127.059159043842;

        Map<String, double[]> stations = new HashMap<>();
        stations.put("서울역", new double[]{37.5547, 126.9707});
        stations.put("시청역", new double[]{37.5647, 126.9750});
        stations.put("을지로입구역", new double[]{37.5660, 126.9820});
        stations.put("종각역", new double[]{37.5702, 126.9827});
        stations.put("삼성역", new double[]{37.508827, 127.063203});
        stations.put("선릉역", new double[]{37.504257, 127.048174});

        String nearestStation = null;
        double minDistance = Double.MAX_VALUE;

        for (Map.Entry<String, double[]> entry : stations.entrySet()) {
            String name = entry.getKey();
            double[] coords = entry.getValue();
            double distance = haversine(userLat, userLon, coords[0], coords[1]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestStation = name;
            }
        }

        System.out.println("가장 가까운 역: " + nearestStation);
    }
}
