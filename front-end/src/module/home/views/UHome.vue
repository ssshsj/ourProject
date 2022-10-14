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
    <div class="popular-courses-area padding-80-0">
      <el-row justify="center" :gutter="50">
        <el-col span="24">
          <div class="section-heading">
            <h3>热门课程</h3>
          </div>
        </el-col>
      </el-row>
      <el-row justify="center" :gutter="50">
        <el-col v-for="i in 3" :span="6">
          <transition name="fade-transform" mode="out-in">
            <div class="single-popular-course" v-show="showCourses">
              <img :src="require('@/assets/img/bg-img/c1.jpg')" alt="">
              <div class="course-content">
                <h4>英语语法</h4>
                <div class="meta d-flex align-items-center">
                  <a href="#">Tanma</a>
                  <span></span>
                  <a href="#">艺术 &amp; 设计</a>
                </div>
                <p>7天搞定英语语法，一线名师带你突破英语基础语法困境，扎实提升。</p>
              </div>
              <div class="seat-rating-fee d-flex justify-content-between">
                <div class="seat-rating h-100 d-flex align-items-center">
                  <div class="seat">
                    <i class="el-icon-user-solid" aria-hidden="true"></i> 10
                  </div>
                  <div class="rating">
                    <i class="el-icon-star-on" aria-hidden="true"></i> 4.5
                  </div>
                </div>
                <div class="course-fee h-100">
                  <a href="#" class="free">免费</a>
                </div>
              </div>
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
      showCourses:false,
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
    window.onscroll = function () {
      vm.isActive = document.documentElement.scrollTop > 60
      if (document.documentElement.scrollTop > 250) {
        setTimeout(() => {
          vm.showCourses = true
        }, 350)
      }
    }
    setTimeout(() => {
      vm.showFacts = true
    }, 350)
  }
}
</script>

<style lang="scss" rel="stylesheet/scss" scoped>
@import "../css/style.scss";
</style>