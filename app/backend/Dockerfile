FROM node:14 AS backend
WORKDIR /usr/src/app
COPY . .
COPY ./index.js /usr/src/app/index.js
RUN npm install

CMD ["node", "index.js"]
