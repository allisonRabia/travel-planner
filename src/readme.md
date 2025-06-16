In the travel planner openapi.yaml file please add the following endpoints: 

 - GET: /trips/{tripId}
 - POST: /trips with requestBody: required: true and content: application/json: schema: referencing the same Trip object
   Read more about it here: https://nakulshukla.medium.com/develop-rest-apis-with-openapi-spec-and-using-custom-generators-via-templates-dc606dae9a21
