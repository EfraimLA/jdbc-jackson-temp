set -e

./scripts/start-containers.sh

./mvnw package -Pnative

./target/**runner && ./scripts/curl.sh
