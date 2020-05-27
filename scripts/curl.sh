curl --location --request POST 'localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
	"birthDate": "2020-05-14T05:00:00.000Z",
	"birthTime": "2020-05-14T05:00:00.000Z"
}'

curl --location --request GET 'localhost:8080/users'