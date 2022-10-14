<template>
  <div>
    <el-row class="hero-area" justify="center" align="middle">
      <el-col :span="24">
        <div class="hero-content">
          <h2>硕果云教学管理平台</h2>
          <h4>基于Spring Cloud搭建的新一代微服务教学管理平台</h4>
          <h4>提供多租户、权限管理、考试、练习等功能</h4>
          <router-link to="/courses" class="link-btn clever-btn">开始使用</router-link>
        </div>
      </el-col>
    </el-row>
    <div class="padding-80-0">
      <el-row justify="center" :gutter="50">
        <el-col v-for="item in sections" :span="4">
          <transition name="fade-transform" mode="out-in">
            <div class="single-cool-facts-area mb-80" v-show="showFacts">
              <div class="icon">
                <img :src="starUrl" alt="">
              </div>
              <h2>
                <count-to :start-val="0" :end-val="item.num" :duration="2600" class="counter"/>
              </h2>
              <h5>{{ item.title}}</h5>
            </div>
          </transition>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import {CountTo} from 'vue3-count-to'
export default {
  name: "UHome",
  components:{
    CountTo
  },
  data(){
    return{
      showFacts: false,
      starUrl:require('@/assets/img/core-img/star.png'),
      sections:[
        {
          num:200,
          title:'用户数'
        },
        {
          num:500,
          title:'考试数'
        },
        {
          num:233,
          title:'题目数'
        },
        {
          num:300,
          title:'课程数'
        },
      ]
      //此处尝试了直接src，绑定式src但是没有使用@,仅使用@可用
    }
  },
  created() {
    let vm = this
    setTimeout(() => {
      vm.showFacts = true
    }, 350)
  }
}
</script>

<style lang="scss" rel="stylesheet/scss" scoped>
@import "../css/style.scss";
</style>