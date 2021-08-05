import axios from 'axios'

// state
const state = () => ({
  resultTag: null,
  resultPhotographer: null,
  isSearchHeaderShow: false,
})

// actions
const actions = {
  tagSearch({ commit, rootState }, info) {
    axios({
      method: 'post',
      url: `http:어쩌고/search/tag/${info.keyword}/${info.region}`,
      headers: rootState.login.TOKEN,
      data: JSON.stringify(info),
    })
      .then((res) => {
        console.log(res)
        // 추가해야 함!
        commit('TAG_SEARCH', 'res.data.???')
        this.$router.push({ name: 'SearchResult' })
      })
      .catch((err) => {
        console.log(err)
        alert('다시 시도해주십시오.')
      })
  },
  photographerSearch({ commit, rootState }, info) {
    axios({
      method: 'post',
      url: `http:어쩌고/search/pg/${info.keyword}/${info.region}`,
      headers: rootState.login.TOKEN,
      data: JSON.stringify(info),
    })
      .then((res) => {
        console.log(res)
        // 추가해야 함!
        commit('PHOTOGRAPHER_SEARCH', 'res.data.???')
        this.$router.push({ name: 'SearchResult' })
      })
      .catch((err) => {
        console.log(err)
        alert('다시 시도해주십시오.')
      })
  },
}

const mutations = {
  TAG_SEARCH(state, data) {
    state.resultTag = data
  },
  PHOTOGRAPHER_SEARCH(state, data) {
    state.resultPhotographer = data
  },
}

export default {
  state,
  actions,
  mutations,
}