set -e
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
mkdir -p $DIR/build
cd $DIR/backend
php composer.phar update
cd $DIR/admin
npm install
bower install
gulp build
cd dist
rm $DIR/build/admin.zip
zip -r $DIR/build/admin.zip *
cd $DIR
