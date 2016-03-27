var gulp = require('gulp');
var inject = require('gulp-inject');

var jquery = require('jquery');

gulp.task('default', ['index']);

var paths = {
  javascript: [
    './src/main/webapp/js/*.js'
  ]
};

gulp.task('index', function () {
  return gulp.src('./src/main/webapp/index.html')
      .pipe(inject(
          gulp.src(paths.javascript,
              {read: false}), {relative: true}))
      .pipe(gulp.dest('./src/main/webapp/js'));
});