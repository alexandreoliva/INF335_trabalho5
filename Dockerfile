// build the image
docker build -t first-dockerfile -f Dockerfile1 .

// list image
docker images

// run the image
docker run -it -d olaunicamp

// use exec for interaction
docker exec -it d833a10812ed bash
