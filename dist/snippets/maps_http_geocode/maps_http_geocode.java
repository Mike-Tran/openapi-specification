// [START maps_http_geocode]
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://maps.googleapis.com/maps/api/geocode/json?address=1600%20Amphitheatre%20Parkway%2C%20Mountain%20View%2C%20CA&key=YOUR_API_KEY")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
// [END maps_http_geocode]