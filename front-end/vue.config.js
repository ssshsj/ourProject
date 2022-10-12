const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false,
  devServer:{
    proxy:{
      '/api': {
        //要访问的跨域的域名
        target: 'http://127.0.0.1:80',
        ws: true,
        secure:false, // 使用的是http协议则设置为false，https协议则设置为true
        changOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
})
