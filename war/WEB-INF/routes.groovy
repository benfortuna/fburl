
// routes for the blobstore service example
get "/request",  forward: "/freebusy.groovy"

get "/favicon.ico", redirect: "/images/favicon.png"
