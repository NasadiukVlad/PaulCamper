Implement a microservice that calculates the longest vacancy period of a car for rent upon the call of:

POST /longest-free-range
Input: request body is expected be a json object which contains: start and end dates for renting and a list of existing reservations of a car. Reservation might not all lie within the renting range. No range can exceed 1 year.

Output: 200 OK with a json object, containing the first longest time range within specified renting date range, which is not covered by any reservation. If the input is not a correct json, the dates are not valid or any end date in the ranges preceeds the start date, return an 400 Bad request with the error cause message as a plain text.

Please host your solution as a free app on https://heroku.com. Provide a link to your app, as well as to the git repo. Make sure to include necessary tests for your code.

Sample input:

{
  "renting_period": {"start": "2015-12-01",  "end": "2015-12-31"}
  "reservations": [
    {"start": "2015-10-01", "end": "2015-10-05"},
    {"start": "2015-12-17", "end": "2015-12-17"},
    {"start": "2015-12-05", "end": "2015-12-07"}
  ]
}
Sample output:

{"start": "2015-12-18", "end": "2015-12-31"}