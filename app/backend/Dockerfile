FROM node:14 AS backend
WORKDIR /usr/src/app
COPY . .
RUN npm install
FROM node:14.0.0-alpine
WORKDIR /app
CMD ["node", "index.js"]
